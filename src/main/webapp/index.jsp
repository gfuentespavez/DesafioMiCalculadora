<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>
        DesafioMiCalculadora
    </title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="mt-5">
        DesafioMiCalculadora
    </h1>
    <form method="post" action="Calculadora" class="mt-3">
    <div class="form-group">
            <label for="num1">
                Número 1:
            </label>
            <input type="text" class="form-control" id="num1" name="num1" required>
        </div>
        <div class="form-group">
            <label for="num2">
                Número 2:
            </label>
            <input type="text" class="form-control" id="num2" name="num2" required>
        </div>
        <div class="form-group">
            <label for="operation">Operación:</label>
            <select class="form-control" id="operation" name="operation">
                <option value="suma">Suma</option>
                <option value="resta">Resta</option>
                <option value="multiplicacion">Multiplicación</option>
                <option value="division">División</option>
                <option value="ordenar">Ordenar</option>
                <option value="parimpar">Par o Impar</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Calcular</button>
    </form>
</div>
</body>
</html>
