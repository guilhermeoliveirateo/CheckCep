# CheckCep - Postal Code Query API

## 📋 Description
CheckCep is a REST API developed with Spring Boot to check address information using postal codes. The project consumes the ViaCEP public API to provide the complete location data.

## 🚀 Technologies Used
* **Java 17** - Core programming language
* **Spring Boot** - Framework for Java application development
* **Spring Web** - Module for building RESTful APIs
* **Maven** - Dependency manager and build tool
* **RestTemplate** - HTTP client for consuming external APIs

## 🔌Consumed API
**ViaCEP**
* **Base URL:** `https://viacep.com.br/ws/{cep}/json`
* **Description:** Free API that returns Brazilian address information via postal codes.
* **Documentation:** [ViaCEP](https://viacep.com.br/)
* **Response Format:** JSON

## 📁 Project Structure
```text
CheckCep/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/CheckCep/
│   │   │       ├── controller/
│   │   │       │   └── CheckCepController.java
│   │   │       ├── domain/
│   │   │       │   └── CheckCepDomain.java
│   │   │       └── CheckCepApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## 🛠️ How to Run
**Prerequisites**
* Java 17 or higher
* Maven 3.6+

**Execution Steps**
1. Clone the repository.
2. Navigate to the project folder: `cd CheckCep`
3. Run the project: `./mvnw spring-boot:run`
4. The application will be available at: `http://localhost:8080`

## 📡 API Endpoints
**Postal Code (CEP) Query**
* **URL:** `GET /api/cep/{cep}`
* **Parameter:** `cep` - Postal code in the format: `00000000` (e.g., `01001000`)
* **Response:** JSON object containing the address information.

**Example Request:**
```bash
curl http://localhost:8080/cep/01001000
```

## 📊 Example Response
```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```

## 🏗️ Architecture
* **Controller Layer:** Manages incoming HTTP requests and routing.
* **Domain Layer:** Defines the data objects mapping the API response.

## 🔧 Configurations
The project uses standard Spring Boot configurations. To customize the environment, edit the src/main/resources/application.properties file.

## 🧪 Tests
Run the test suite using the following command:
```bash
./mvnw test
```

## 🖥️ Frontend Interface
A dedicated frontend was developed to consume this API and provide a visual interface for postal code queries. The application was built using **Lovable**, ensuring a fast, modern, and responsive user experience to interact with the backend endpoints.

🔗 **Access the Application:** [Click here to use the CheckCep Frontend](https://checkcep.lovable.app)
