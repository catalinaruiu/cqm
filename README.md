# Quality Application

## Description

CQM (Call Quality Master) is a call monitoring web application designed for the call center department of small and medium-sized businesses. CQM allows the growth of 3 major business players: the management, the employees, and the customers. Whether you need a better reporting base, more learning opportunities for your employees, or just a better customer experience for your clients, CQM is a solution to consider.

## Technologies used

- **IDE:** IntelliJ IDEA
- **Frameworks:** Spring, Bootstrap
- **Project Management Build Tool:** Maven
- **Programming Languages and Libraries:** Java, JavaScript (JSX)
- **Markup Language:** HTML
- **Styling:** CSS
- **Database:** PostgreSQL
- **Additional Tools and Libraries:** Spring Boot, React.js, npm
- **Version Control:** Git & GitHub

## Installation

As this is a project developed in both IntelliJ and VS Code, the running instructions work best if you use the same IDEs. In other cases, please feel free to research the way to run the project according to its needs with your chosen IDE.

1. Download the project onto your local machine.
2. Open the ‘backend’ folder in IntelliJ IDEA. This is a Maven project, so you need to open the file `pom.xml`.
3. Connect a PSQL database.
4. Open the ‘frontend’ folder in VS Code.
5. Make sure you already have Node.js installed on your device (needed for running a React project).
6. Open a new terminal in VS Code and run the commands in this order:
   - `npm install`
   - `npm start`
7. Run the backend part from the file `QualityApplication.java`.
8. Open the link `http://localhost:3000/` in a new browser.

## Implementation

### Users

There are 4 types of users: Agents, Quality Analysts, Quality Team Leaders, and Operations Team Leaders. The team leaders are responsible for maintaining the users’ table. They can add, edit, or deactivate users. There is no option to delete users.

### Evaluations

Quality Analysts listen to calls, evaluate the agent’s performance, and submit the scores through the new evaluation form. After this, the agent needs to acknowledge it and leave a comment if wished so. All evaluations can be viewed in a table. Only the QA Team Lead can delete evaluations.

### Calibrations

There is a calibration process. Its purpose is to make sure that all Quality Analysts evaluate the agents as objectively as possible. A calibration evaluation is no different than a normal one.

### Reporting

For reporting purposes, the team leaders have access to dashboards and data tables with filtering and sorting options.

## Ideas For Further Development

- Create more components
- Improve styling
- Create in-app inbox for notifications
- Create meeting forms
- Deploy the project
