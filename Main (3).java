import java.util.*;
import java.net.*;
import java.io.*;
import java.text.DecimalFormat;

import com.google.gson.*;

class Result {

    public static List<String> maximumTransfer(String name, String city) {

        int page = 1;
        int total_page = 1;

        List<String> ans = new ArrayList<>();

        double maxCredit = 0;
        double maxDebit = 0;

        try {

            while (page <= total_page) {

                URL url = new URL("https://jsonmock.hackerrank.com/api/transactions?page=" + page);

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));

                JsonObject response = JsonParser.parseReader(br).getAsJsonObject();

                total_page = response.get("total_pages").getAsInt();

                JsonArray arr = response.getAsJsonArray("data");

                for (JsonElement element : arr) {

                    JsonObject obj = element.getAsJsonObject();
                    JsonObject locationObj = obj.getAsJsonObject("location");

                    String username = obj.get("userName").getAsString();
                    String cityStr = locationObj.get("city").getAsString();
                    String txnType = obj.get("txnType").getAsString();

                    if (username.equals(name) && cityStr.equals(city)) {

                        String amountStr = obj.get("amount").getAsString();
                        amountStr = amountStr.replace("$", "").replace(",", "");

                        double amount = Double.parseDouble(amountStr);

                        if (txnType.equals("credit")) {
                            maxCredit = Math.max(maxCredit, amount);
                        } else if (txnType.equals("debit")) {
                            maxDebit = Math.max(maxDebit, amount);
                        }
                    }
                }

                page++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        DecimalFormat df = new DecimalFormat("$#,##0.00");

        ans.add(df.format(maxCredit));
        ans.add(df.format(maxDebit));

        return ans;
    }
}