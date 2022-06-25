<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="styles.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <title>CHI FOU MI</title>
</head>
<body>
<%
    int resultatJoueur = (int) request.getAttribute("score");
    int resultatPc = (int) request.getAttribute("scorePc");
%>
<div class="container-fluid d-flex justify-content-center">
    <div class="score">
        <p>Score du joueur : </p><%= resultatJoueur%> </br>
        <p>Score de l'ordinateur : </p><%=resultatPc%>
        </br>
        <div class="bouton">
            <a href="/PierreFeuilleCiseauV2">REJOUER</a>
        </div>
    </div>
</body>
</html>
