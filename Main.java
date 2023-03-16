
/*import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
  public static void main(String[] args) {
    String url = "https://www.walmart.com/browse/electronics/dell-gaming-laptops/3944_3951_7052607_1849032_4519159";

    try {
      // Connect to the webpage and retrieve the HTML content
      Document doc = Jsoup.connect(url).get();

      // Find all the products on the page
      Elements products = doc.select("div.search-product-gridview-item");

      // Create a FileWriter object to write to the CSV file
      FileWriter csvWriter = new FileWriter("top_products.csv");
      
      // Write the headers to the CSV file
      csvWriter.append("Product Name,Product Price,Item Number,Model Number,Product Category,Product Description\n");

      // Loop through the top 10 products and extract the details
      //for (Element product : products.subList(0, 10)) {
        for (Element product : products.subList(0, Math.min(10, products.size()))) {
        /*String name = product.select("a.product-title-link").text().trim();
        String price = product.select("span.price-group").text().trim();
        String item_number = product.attr("data-us-item-id");
        String model_number = product.attr("data-model-number");
        String category = product.attr("data-category");
        String description = product.select("div.search-product-result-description").text().trim();*/
/*String name = product.select("div.search-result-product-title a").text().trim();
String price = product.select("span.price-group").text().trim();
String item_number = product.attr("data-us-item-id");
String model_number = product.attr("data-model-number");
String category = product.attr("data-category");
String description = product.select("div.search-result-product-description").text().trim();

        
        // Write the details to the CSV file
        csvWriter.append(name + "," + price + "," + item_number + "," + model_number + "," + category + "," + description + "\n");
      }
      
      // Close the CSV file
      csvWriter.close();

      System.out.println("Product details written to top_products.csv");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}*/

import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
  public static void main(String[] args) {
    String url = "https://www.walmart.com/browse/electronics/dell-gaming-laptops/3944_3951_7052607_1849032_4519159";

    try {
      // Connect to the webpage and retrieve the HTML content
      Document doc = Jsoup.connect(url).get();

      // Find all the products on the page
      Elements products = doc.select("div.search-result-gridview-item");

      // Create a FileWriter object to write to the CSV file
      FileWriter csvWriter = new FileWriter("top_products.csv");
      
      // Write the headers to the CSV file
      csvWriter.append("Product Name,Product Price,Item Number,Model Number,Product Category,Product Description\n");

      // Loop through the top 10 products and extract the details
      //for (Element product : products.subList(0, 10)) {
        for (Element product : products.subList(0, Math.min(10, products.size()))) {
        String name = product.select("div.search-result-product-title a").text().trim();
        String price = product.select("span.price-group").text().trim();
        String item_number = product.attr("data-us-item-id");
        String model_number = product.attr("data-model-number");
        String category = product.attr("data-category");
        String description = product.select("div.search-result-product-description").text().trim();
        
        // Write the details to the CSV file
        csvWriter.append(name + "," + price + "," + item_number + "," + model_number + "," + category + "," + description + "\n");
      }
      
      // Close the CSV file
      csvWriter.close();

      System.out.println("Product details written to top_products.csv");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



