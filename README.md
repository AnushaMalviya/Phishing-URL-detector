# Phishing-URL-detector
Phishing URL Detector is a tool that checks if a given URL is potentially harmful or suspicious. It analyzes the URL based on factors like the presence of IP addresses, suspicious keywords, excessive subdomains, or unusual length to help users identify and avoid phishing websites that may steal personal data.
A simple web application built with Spring Boot and Thymeleaf to detect potentially malicious or phishing URLs based on basic analysis rules.

# Features
<ul> 
<li> Detects phishing URLs based on IP addresses, suspicious keywords, long length, and multiple subdomains.</li>

<li> User-friendly web interface.</li>

<li> Instant result display with clear safe or phishing indication.</li>
</ul>
# Prerequisites
<ul> 
  <li> Java 17 or later </li>

  <li> Maven </li>

  <li> Spring Boot </li>

# Installation
Clone the repository

bash
Copy
Edit
git clone https://github.com/your-username/phishing-url-detector.git
cd phishing-url-detector
Build the project using Maven

nginx
Copy
Edit
mvn clean install
Running the Application
Navigate to the project directory if not already there.

Run the application using Maven

arduino
Copy
Edit
mvn spring-boot:run
or by running the main class from your IDE (PhishingUrlDetectorApplication.java).

Open your browser and go to

arduino
Copy
Edit
http://localhost:8080/
Enter a URL and check if it is safe or potentially a phishing link.

Project Structure
PhishingController.java - Handles the web requests and phishing detection logic.

templates/index.html - Form page for URL input.

templates/result.html - Displays the detection result.

Dependencies Used
Spring Boot Starter Web

Spring Boot Starter Thymeleaf

Dependencies are automatically managed through Maven
