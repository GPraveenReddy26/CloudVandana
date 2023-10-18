function submitForm() {
    const form = document.getElementById("surveyForm");
    const successMessage = document.getElementById("successMessage");
    const submitButton = document.getElementById("submitButton");

    if (form.checkValidity()) {
        // Hide the "Submit" button
        submitButton.style.display = "none";

        // Show the "Submit Successfully" message
        successMessage.style.display = "block";
    }
    else {
        // Display an error message
        const errorMessage = document.getElementById("errorMessage");
        errorMessage.style.display = "block";
    }
}

function submitAgain() {
    const form = document.getElementById("surveyForm");
    const successMessage = document.getElementById("successMessage");
    const submitButton = document.getElementById("submitButton");

    // Hide the "Submit Successfully" message
    successMessage.style.display = "none";

    // Show the "Submit" button
    submitButton.style.display = "block";
}

function closePopup() {
    const popup = document.getElementById("popup");
    popup.style.display = "none";
}

function resetForm() {
    const form = document.getElementById("surveyForm");
    form.reset();
    closePopup();
}
