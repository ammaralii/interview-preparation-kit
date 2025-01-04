# Java Key Features (2014–2023)

Welcome to the Java Key Features overview!

## Java Feature Timeline

### Java 8 (2014)  
- 🔄 **Lambdas**  
  ```java
  List<String> names = Arrays.asList("John", "Jane", "Jake");
  names.forEach(name -> System.out.println(name));
  ```
- 🌊 **Streams API**  
  ```java
  List<String> filtered = names.stream()
      .filter(name -> name.startsWith("J"))
      .collect(Collectors.toList());
  ```
- 🕒 **Date and Time API**  
  ```java
  LocalDate today = LocalDate.now();
  LocalDate nextWeek = today.plusWeeks(1);
  ```
- 🔧 **Default Methods in Interfaces**  
  ```java
  interface Vehicle {
      default void start() {
          System.out.println("Vehicle starting...");
      }
  }
  ```

### Java 9 (2017)  
- 📦 **Module System**  
  ```java
  module com.example.myapp {
      requires java.base;
  }
  ```
- 💻 **JShell (Interactive REPL)**  
  ```shell
  jshell> int x = 5;
  jshell> System.out.println(x * 2);
  ```
- 🚀 **Improved JVM Performance**  

### Java 10 (2018)  
- 📝 **Local Variable Type Inference**  
  ```java
  var list = List.of("A", "B", "C");
  for (var item : list) {
      System.out.println(item);
  }
  ```
- ♻️ **G1 Garbage Collector Improvements**  
- 📦 **Application Class-Data Sharing (AppCDS)**  

### Java 11 (2018 - LTS)  
- 🌐 **HTTP Client API**  
  ```java
  HttpClient client = HttpClient.newHttpClient();
  HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("https://example.com"))
      .build();
  HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
  ```
- ❌ **Removal of Legacy Features**  
  - ❌ **Applet API**  
- 🏆 **Long-Term Support (LTS)**  

### Java 12 (2019)  
- 🔄 **Switch Expressions (Preview)**  
  ```java
  int result = switch (day) {
      case MONDAY, FRIDAY -> 6;
      case TUESDAY -> 7;
      default -> 0;
  };
  ```
- ♻️ **Shenandoah Garbage Collector**  
- 🚀 **Performance Enhancements (JEP 189)**  

### Java 13 (2019)  
- 📄 **Text Blocks (Preview)**  
  ```java
  String json = """
  {
    "name": "John",
    "age": 30
  }
  """;
  ```
- 📦 **Dynamic CDS Archives**  
- 🌐 **Improved Socket API**  

### Java 14 (2020)  
- 🔄 **Records (Preview)**  
  ```java
  record Point(int x, int y) {}
  ```
- 🔍 **Pattern Matching (Preview)**  
  ```java
  if (obj instanceof String s) {
      System.out.println(s.toUpperCase());
  }
  ```
- 💡 **Helpful NullPointerException Messages**  

### Java 15 (2020)  
- 📄 **Text Blocks Finalized**  
- 🔒 **Sealed Classes (Preview)**  
  ```java
  sealed class Shape permits Circle, Rectangle {}
  ```
- 🧠 **Foreign Memory API (Incubator)**  

### Java 16 (2021)  
- 🔄 **Records Finalized**  
- ♻️ **Z Garbage Collector for macOS**  
- 🚀 **Foreign Function & Memory API Improvements**  

### Java 17 (2021 - LTS)  
- 🔍 **Pattern Matching for Switch (Preview)**  
  ```java
  String response = switch (obj) {
      case Integer i -> "Integer: " + i;
      case String s -> "String: " + s;
      default -> "Unknown type";
  };
  ```
- 🔒 **Sealed Classes Finalized**  
- 🎲 **Pseudo-Random Number Generators Improvements**  
- 🏆 **Long-Term Support (LTS)**  

### Java 18 (2022)  
- 🔒 **Strong Encapsulation of JDK Internals (JEP 400)**  
- 🌐 **Support for Alpine Linux**  

### Java 19 (2022)  
- 🧵 **Virtual Threads (Preview)**  
  ```java
  Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread"));
  ```
- 🚀 **Continued Foreign Function & Memory API Enhancements**  

### Java 20 (2023)  
- 🧵 **Virtual Threads Improvements**  
- 🔍 **Pattern Matching Advancements**  
- 🔄 **Enhanced Thread Management**  

### Java 21 (2023 - LTS)  
- 🏆 **Long-Term Support (LTS)**  
- 🧵 **Virtual Threads (Mainstream Adoption)**  
- 🕸️ **Structured Concurrency**  
