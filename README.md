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
</ul>

# Installation
<ol>
  <li>Clone the repository</li>

```bash
#clone the repository 
git clone https://github.com/your-username/phishing-url-detector.git
cd phishing-url-detector
```
<li> Build the project using Maven</li>


```
mvn clean install
```

# Running the Application
<ol type = "1">
  <li>
    Navigate to the project directory if not already there.
  </li>



<li>Run the application using Maven</li> 


```
mvn spring-boot:run
```
or by running the main class from your IDE (`PhishingUrlDetectorApplication.java`).

  <li>
  Open your browser and go to
  </li>

```
http://localhost:8081
```

<li> Enter a URL and check if it is safe or potentially a phishing link.</li>
</ol>

# Project Structure
`PhishingController.java` - Handles the web requests and phishing detection logic.

`templates/index.html` - Form page for URL input.

`templates/result.html` - Displays the detection result.

# Dependencies Used
<ul>

  
<li>Spring Boot Starter Web</li>
  

<li>Spring Boot Starter Thymeleaf</li>
</ul>
Dependencies are automatically managed through Maven


# Screenshot of the project

![Screenshot 2025-04-28 155426](https://github.com/user-attachments/assets/265bac5a-402d-4f32-9bd3-2a0260696809)

![Screenshot 2025-04-28 155325](https://github.com/user-attachments/assets/2a1f1da6-383a-4226-a0ad-1e6b888addd0)

![Screenshot 2025-04-28 155412](https://github.com/user-attachments/assets/2b1b0368-fb53-4d04-b0c2-cfe7b044a2cd)
