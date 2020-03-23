# Certification verification System

Application to verify student's certificate using dept and mat no


**How to set up the application**
* Download the project 
* Import it into your IDE preferable STS or Eclipse 
* Install maven dependencies
* Create a database, 
* In the application.properties file, specify your database name, port,  user name and password as done there
* Run the application 



There are five endpoint in this application

/getStudentRecordUsingMatNo *- Main webservice that gets data from all services*

/addStudentRec *- for Admin to add new student record*

/getAllStudents *- Service to Fetches all students in the db*

/getStudentRecordMatno *- Service to get Certificate record Using Mat no*

/addInstitution *- SuperAdmin Adds Institutions*

