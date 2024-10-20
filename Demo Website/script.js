document
  .getElementById("contact-form")
  .addEventListener("submit", function (event) {
    event.preventDefault(); // Prevent form submission

    // Get form values
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const message = document.getElementById("message").value;

    // Basic validation (you can enhance this)
    if (name && email && message) {
      // Simulate a successful submission
      document.getElementById("response-message").innerText =
        "Message sent successfully!";
      document.getElementById("response-message").style.color = "green";

      // Clear the form
      document.getElementById("contact-form").reset();
    } else {
      document.getElementById("response-message").innerText =
        "Please fill out all fields.";
      document.getElementById("response-message").style.color = "red";
    }
  });
