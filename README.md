
1) Clone the application
	# git clone https://github.com/ravivarma4142/springbootsc.git

2) MongoDB setup	
	# Install mongoDb
	# Connect to your local mongoDb(Default port will be 27017)
	# Create a database with name nodetest and create a collection with name as userdata.

3) Build and running the application using maven
	# cd springbootsc
	# mvn package
	# java -jar target/UserData-0.0.1-SNAPSHOT.jar

4) Usage
	# Application is up and running at http:localhost:8082
	
This application has two api's

	# http://localhost:8082/addUser --POST
	This api save's user details as provided in the request body.
	Request Body:
	{
	    "name": "Mili",
	    "age": 33,
	    "sex": "Female",
	    "country": "Albania",
	}
	
	# http://localhost:8082/fetchUser/Mili --GET
	This api fetche's the data of the particular user provided in the api.
	
	Reponse Body:
	{
	    "name": "ravi",
	    "age": 33,
	    "sex": "Female",
	    "country": "Albania",
	    "createdDate": "2021-09-30T13:26:56.802+00:00"
	}




