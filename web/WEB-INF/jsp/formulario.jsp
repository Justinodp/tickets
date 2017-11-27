<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/bootstrap.js"/></script>

</head>
<body style="background-color: #ececf6">
    <div class="container" style="margin: 8% ;">
        <form method="POST" action="guardarticket.htm">
            <div class="row">
                <div class="col-md-4" style="background: white;height: 2cm;"></div>
                <div class="col-md-4" style="background: white;height: 2cm;">
                    <label for="inputEmail4" >Reporte de Falla</label>
                </div>
                <div class="col-md-4" style="background: white;height: 2cm;"></div>
            </div>
            <div class="row">
                <div class="col-md-3" style="background: white;height: 2cm;"></div>
                <div class="col-md-6" style="background: white;height: 2cm;">
                    <label for="inputEmail4">Nombre</label>
                    <input type="text" class="form-control" id="nombre" required>
                </div>
                <div class="col-md-3" style="background: white;height: 2cm;"></div>
            </div>

            <div class="row">
                <div class="col-md-3" style="background: white;height: 2cm;"></div>
                <div class="col-md-3" style="background: white;height: 2cm;">
                    <label for="inputTelefono">Telefono</label>
                    <input type="text" class="form-control" id="telefono" required>
                </div>
                <div class="col-md-3" style="background: white;height: 2cm;">
                    <label for="inputEmail">Correo</label>
                    <input type="email" class="form-control" id="correo" required>
                </div>
                <div class="col-md-3" style="background: white;height: 2cm;"></div>
            </div>

            <div class="row">
                <div class="col-md-3" style="background: white;height: 2cm;"></div>
                <div class="col-md-3" style="background: white;height: 2cm;">
                    <label for="inputState">Producto</label>
                    <select id="producto" class="form-control">
                        <option selected>Producto</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                    </select>
                </div>
                <div class="col-md-3" style="background: white;height: 2cm;">
                    <label for="inputState">Falla del Producto</label>
                    <select id="falla" class="form-control">
                        <option selected>Producto</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">Otro</option>
                    </select>
                </div>
                <div class="col-md-3" style="background: white;height: 2cm;"></div>
            </div>
            

            <div class="row">
                <div class="col-md-5" style="background: white;height: 1cm;"></div>
                <div class="col-md-2" style="background: white;height: 1cm;">               
                    <button type="submit" style='width:150px; height:40px;border-radius:10px'>Enviar</button>
                </div>
                <div class="col-md-5" style="background: white;height: 1cm;"></div>
            </div>
        </form> 
    </div>
</form>
</body>
</html>