function addProduct(idProduct) {
    let product = { '"idProduct"': parseInt(data.idProduct), '"name"': data.name, '"price"': data.price, '"url"': data.url };
    fetch('http://localhost:9090/products/' + idProduct, {
        method: "PUT",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(product),
      }).then((response) => {
        window.location.replace("/index.html");
      })           
}

function getBodyProduct(id) {
    let product = {}
    fetch('http://localhost:9090/products/' + id)
        .then(response => response = res.json())
        .then(data => {
            product = { '"idProduct"': parseInt(data.idProduct), '"name"': data.name, '"price"': data.price, '"url"': data.url };
            return product;
        })
}

function addNewProduct(idProduct) {
    let product = { '"idProduct"': parseInt(data.idProduct), '"name"': data.name, '"price"': data.price, '"url"': data.url };

    fetch('http://localhost:9090/products/' + idProduct, {
        method: "POST",
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(product)
        })
        .then(response => {
        window.location.replace("index.html")
        })

}

function editProduct(idProduct) {
    let product = { '"idProduct"': parseInt(data.idProduct), '"name"': data.name, '"price"': data.price, '"url"': data.url };
    fetch('http://localhost:9090/products/' + idProduct)
        .then(response => response = response.json())
        .then(data => {

            fetch(url, {
                method: 'PUT',
                body: JSON.stringify(product),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(response => {
                window.location.href = "/index.html";
            });
        })
}

function deleteProduct(idOP) {
    fetch('http://localhost:9090/orderProducts' + idOP, {
            method: 'DELETE',
        })
        .then(response => response.text())
        .then(response => {
            console.log(response);
            window.location.href = "/index.html";
        })
}

function deleteAllOrder(id) {
    fetch('http://localhost:9090/orderproducts/order/' + id, {
            method: 'DELETE',
        })
        .then(response => response.text())
        .then(response => {
            window.location.href = "/index.html";
        })
}

function reload() {
    var e = document.getElementById("languages");
    var selectedLang = e.options[e.selectedIndex].value;

    var url = "?lang=" + selectedLang
    location.href = url;
}