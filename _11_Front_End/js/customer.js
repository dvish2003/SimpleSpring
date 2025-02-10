function saveCustomer() {
    let ID = $('#customerId').val();
    let Name = $('#customerName').val();
    let Address = $('#customerAddress').val();
    let Age = $('#customerAge').val();

    // Check the data in the console
    console.log("Saving Customer: ", ID, Name, Address, Age);

    $.ajax({
        url: 'http://localhost:8080/BackEnd_10_Web_exploded/api/v1/customer/save',
        type: 'POST',
        contentType: 'application/json',
        async: true,
        data: JSON.stringify({
            "id": ID,
            "name": Name,
            "address": Address,
            "age": Age
        }),
        success: function(data) {
            console.log("Customer Saved:", data);
            alert("Customer saved successfully!");

        },
        error: function(error) {
            console.error("Error Saving Customer:", error);
            alert("Failed to save customer.");
        }
    });
}
