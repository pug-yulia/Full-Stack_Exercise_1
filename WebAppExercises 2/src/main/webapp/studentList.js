//
//
//
function main() {
	// Send a request to the server
	fetch("http://localhost:8080/WebAppExercises/students")
		// Convert the server's JSON response to a JavaScript object
		.then(response => response.json())
		// Call the method which will display the data
		.then(studentList => printStudents(studentList));
}

function printStudents(studentList) {
	let table = document.getElementById("tbodyStudents");
	let output = "";
	for (let student of studentList) {
		//console.log(student);
		output += "<tr>" +
			"<td>" + student.id + "</td>" +
			"<td>" + student.firstname + "</td>" +
			"<td>" + student.lastname + "</td>" +
			"<td>" + student.streetaddress + "</td>" +
			"<td>" + student.postcode + "</td>" +
			"<td>" + student.postoffice + "</td>" +
			"</tr>";
	}
	table.innerHTML = output;
}

// Call the main function when the browser loads the HTML page
main();
