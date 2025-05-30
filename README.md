""# 🧪 Akakce.com Selenium Test Automation Project

![Selenium](https://img.shields.io/badge/Selenium-Automation-green)
![TestNG](https://img.shields.io/badge/TestNG-Java-blue)
![POM](https://img.shields.io/badge/Framework-PageObjectModel-lightgrey)

> ✅ This project automates end-to-end user scenarios for [Akakce.com](https://www.akakce.com) using Selenium WebDriver and Java.

---

## 📌 Project Objective

This repository provides automated test coverage for common user actions like registration, login, logout, profile access, message box, and order history. It ensures user functionality is always consistent and reliable with both positive and negative test cases.

---

## 🚀 Getting Started

```bash
git clone https://github.com/BarisSaydam/Akakce_Project_Selenium.git
```

1. Open the project in IntelliJ IDEA.
2. Load Maven dependencies via `pom.xml`.
3. Execute test cases from the `testcases` package.

---

## 🛠️ Technologies Used

| Technology | Description |
|------------|-------------|
| Java | Programming language |
| Selenium WebDriver | Browser automation tool |
| TestNG | Testing framework |
| Maven | Build and dependency manager |
| Git & GitHub | Version control & collaboration |
| IntelliJ IDEA | IDE for Java development |

---

## 🧪 Test Scenarios Summary

| ID | Scenario | Type | Description |
|----|----------|------|-------------|
| TC_0101 | Registration | ✅ Positive | Valid user information |
| TC_0102 | Registration | ❌ Negative | Missing user fields |
| TC_0201 | Verification | ✅ Positive | Username displayed post-login |
| TC_0301 | Logout | ✅ Positive | Successful logout |
| TC_0401 | Login | ✅ Positive | Valid credentials |
| TC_0402 | Login | ❌ Negative | Invalid password |
| TC_0403 | Login | ❌ Negative | Invalid email |
| TC_0404 | Login | ❌ Negative | Empty credentials |
| TC_0501 | Orders | ✅ Positive | View order list |
| TC_0601 | Messages | ✅ Positive | View inbox |
| TC_0701 | Account Deletion | ✅ Positive | Valid password |
| TC_0702 | Account Deletion | ❌ Negative | Invalid password |

Refer to the included PDF for full test case documentation: `TestCaseFor_akakce.com.pdf`

---

## 📁 Project Structure

```
Akakce_Project_Selenium/
├── src/
│   └── test/
│       └── java/
│           ├── testcases/
│           └── pages/
├── pom.xml
└── README.md
```

- `testcases/` – Contains test methods
- `pages/` – Page Object Model structure for elements

---

## 🔄 GitHub Workflow

This project follows GitHub Flow as outlined in `GitHub_Flow.pdf`:

1. Clone the main repository
2. Create a new branch from `master`
3. Make changes, then commit
4. Push to your remote branch
5. Open a Pull Request for code review and merge
6. Sync your local `master` with upstream changes

---

## 🖼️ Screenshots

Some test result visuals:

- [✅ Successful Registration](https://drive.google.com/file/d/1uLPZ4zTam61KyY8CQlcAkLDpbus4_Xz6/view?usp=drive_link)
- [❌ Failed Registration](https://drive.google.com/file/d/1974Vzij49LwZAiyngzNPb9K-NbSU1Jmv/view?usp=drive_link)
- [✅ Login Test](https://drive.google.com/file/d/10jXDNYdksFIwu9_lgHuMdw5wCoRq5fFg/view?usp=drive_link)
- [✅ Account Deletion](https://drive.google.com/file/d/1nWjjhCEU_KrM8eHOrHddk57jUOo2hMEF/view?usp=drive_link)

---

## 👥 Contributors

| 👤 Name | 🛠️ Role |
|:--------|:--------|
| [Baris Saydam](https://github.com/BarisSaydam) | Jira Controller/QA Tester |
| [Diyar Olmez](https://github.com/diyarolmezz) | QA Tester |
| [Ebubekir Duvarci](https://github.com/Ebubekir2025) | QA Tester |
| [Erdem Ozkan](https://github.com/ErdemOzkann) | Github Manager/QA Tester |
| [Omer Boncuk](https://github.com/palanque92) | QA Tester |
| [Atilla Toros Avci](https://github.com/AtillaTorosAvci) | QA Tester |
| [Gamze Batmaz](https://github.com/GAMZE3845) | QA Tester |

---

## ⚠️ License

This project is intended for educational and non-commercial use only.
""
