<html>
<head>
	<meta charset="UTF-8">
	<title>Menemukan banyak sebuah kata/frasa</title>
</head>
<body>
	<h3>Menemukan banyak sebuah kata/frasar</h3>
	<form method="post">
    <input type="text" name="karakter" placeholder="string"/>
    <input type="text" name="cari" placeholder="katakunci" />
		<input type="submit" name="hitung" value="Hitung">
	</form>
  <?php 
  
  //echo substr_count("banananana", "nana");
		if(isset($_POST["hitung"])){
			$karakter = $_POST["karakter"];
			$cari = $_POST["cari"];
 
      echo "ditemukan ".substr_count($karakter, $cari)." kali";
		}
	?>
</body>
</html>