package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

	 static final String DB_URL = "jdbc:mysql://localhost/reprezentanta";
	   static final String USER = "root";
	   static final String PASS = "Bogdan80";
	
	   
	   public static void main(String[] args) {
		   Random random = new Random();
		   final String[] iduri_reprezentanta= {"1","2","3"};
		   final String[] marci = {"Volkswagen", "Skoda", "SEAT", "Lamborghini", "Audi","Porsche","Mazda","Hyundai","KIA"};
		   final String[] modele ={"Golf","Taycan","Huracan","Aventador","Bayon","Tucson","Leon","Sportage","Cayenne","Octavia","Karoq"};
		   final String[] ani_fabricatie={"2019","2020","2021"};
		   final String[] combustibili={"benzina","diesel","electric"};
		   final String[] tipuri_masina={"nou","second-hand","test-drive"};
		   final String[] eligibile_rabla={"Da","Nu"};
		   
		   //insert into angajat values (1,1,'Andrei','Bogdan-Iulian',STR_TO_DATE('01-06-2000','%d-%m-%Y'),100);
		   final String[] listaNume = {"Popescu","Ionescu","Popa","Pop","Nita","Nitu","Constantinescu","Stan","Stanciu","Dumitrescu","Dima",
				   					   "Gheorghiu","Ionita","Marin","Tudor","Dobre","Barbu","Nistor","Florea","Fratila","Dinu","Dinescu","Georgescu",
				   					   "Stoica","Diaconu","Diaconescu","Mocanu","Voinea","Albu","Petrescu","Manole","Cristea","Toma","Stanescu",
				   					   "Puscasu","Tomescu","Sava","Ciobanu","Rusu","Ursu"};
		   final String[] listaPrenume = {"Andrei","David","Alexandru","Gabriel","Stefan","Ionut","Mihai","Cristian","Darius","Daniel","Maria","Andreea",
				   						  "Elena","Ioana","Alexandra","Ana","Antonia","Daria","Gabriela","Stefania"};
		   final String[] numeStrazi = {"Cenuseresei","Aromei", "Capreni", "Competitiei", "Diminetii", "Existentei", "Inocentei", "Afirmarii","Calitatii", "Frumusita", "Fundeni",
				   						"Somnului", "Viitorului", "Lanternei", "Lecturii", "Melodiei", "Ochisoru", "Poeziei", "Ritmului", "Serii", "Sperantei", "Turistilor", "Verii"};
		   final String[] firme_asigurare= {"Euroins","Garanti","Omniasig","ASIROM","City Insurance"};
		   final String[] tipuri_asigurare= {"RCA","CASCO","mixt"};
		   final int[] id_uri_masini_testdrive= {2,6,8,9,11,18,20,25,48,58,66,77,78,80,82,85,88,92,95,96,97,98,100};
		   final int[] iduri_cons= {3,4,10,21,30};
		   final int[] mecanici= {2,5,6,9,11,15,18,22,26,27,29};
		   final String[] coduri_motor={"AZMB","HAUB","MIAU","IAAA"};
		   final String[] modalitate_plata= {"Cash","Card","Rate"};
		   LocalDate from = LocalDate.of(2019, 1, 1);
		   LocalDate to = LocalDate.of(2021, 7, 3);
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {	 /*for(int i = 1 ; i<=100;i++) {
	    	  int idreprRandom=Integer.parseInt(iduri_reprezentanta[random.nextInt(iduri_reprezentanta.length)]);
			   int aniRandom = Integer.parseInt(ani_fabricatie[random.nextInt(ani_fabricatie.length)]);
			   String marciRandom = marci[random.nextInt(marci.length)];
			   String modeleRandom = modele[random.nextInt(modele.length)];
			   String codMotorRandom = coduri_motor[random.nextInt(coduri_motor.length)];
			   String combustibiliRandom = combustibili[random.nextInt(combustibili.length)];
			   String tipuri_masinaRandom = tipuri_masina[random.nextInt(tipuri_masina.length)];
			   String eligibile_rablaRandom = eligibile_rabla[random.nextInt(eligibile_rabla.length)];
			   final int preturi = random.nextInt(30000)+20000;
			   final int capacitateCilindrica=random.nextInt(2000)+2000;
			   final int kilometraj=random.nextInt(500);
	          String sql = "insert into masina(id_masina,id_reprezentanta,marca,model,an_fabricatie,capacitate_cilindrica,combustibil,cod_motor,tip_masina,pret,kilometraj,eligibil_rabla) "
	          		+ "values" + "('"+i+"','"+idreprRandom+"','"+marciRandom+"','"+modeleRandom+"','"+aniRandom+"','"+capacitateCilindrica+"','"+combustibiliRandom+"','"
	        		  +codMotorRandom+"','"+tipuri_masinaRandom+"','"+preturi+"','"+kilometraj+"','"+eligibile_rablaRandom+"')" ; 
	         System.out.println(sql);
	         stmt.executeUpdate(sql);
	      } 
	      			for(int i = 1; i<=300;i++) {
	      			int iduri_masini=random.nextInt(100)+1;
	      			int iduri_dotari=random.nextInt(15)+1;
	      			String sql ="insert into dotare_pe_masina values("+iduri_masini+","+iduri_dotari+");";
	      			;
	      			}
	         for (int i = 2;i<=30;i++) {
	        	 String numeRandom=listaNume[random.nextInt(listaNume.length)];
	        	 String prenumeRandom=listaPrenume[random.nextInt(listaPrenume.length)];
	        	 long days = from.until(to, ChronoUnit.DAYS);
	        	 long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
	        	 LocalDate randomDate = from.plusDays(randomDays);
	        	 String dataRandom = randomDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	        	 String sql="insert into angajat values ("+i+","+(random.nextInt(3)+2)+",'"+numeRandom+"','"+prenumeRandom+"',STR_TO_DATE('"+dataRandom+"','%d/%m/%Y'),"
	        	 +(random.nextInt(50)+1)+");";
	        	 stmt.executeUpdate(sql);	 
	         } 
	    	  
	    	 for (int i = 1; i<=30;i++) {
	    		 String numeRandom=listaNume[random.nextInt(listaNume.length)];
	        	 String prenumeRandom=listaPrenume[random.nextInt(listaPrenume.length)];
	        	 String stradaRandom=numeStrazi[random.nextInt(numeStrazi.length)];
	        	 long days = from.until(to, ChronoUnit.DAYS);
	        	 long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
	        	 LocalDate randomDate = from.plusDays(randomDays);
	        	 String dataRandom = randomDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	        	 String sql="insert into client values ("+i+",'"+numeRandom+"','"+prenumeRandom+"',STR_TO_DATE('"+dataRandom+"','%d/%m/%Y'),'Strada "+ stradaRandom+"');";
	        	 stmt.executeUpdate(sql);
	    	 }
	         for (int i=1 ;i<=15;i++) {
	        	 String firme_asigurare_random=firme_asigurare[random.nextInt(firme_asigurare.length)];
	        	 String tipuri_asigurare_random=tipuri_asigurare[random.nextInt(tipuri_asigurare.length)];
	        	 int iduri_cons_random=iduri_cons[random.nextInt(iduri_cons.length)];
	        	 int durata_asigurare=(random.nextInt(5)+1)*3;
	        	 int pret_asigurare = random.nextInt(500) * durata_asigurare;
	        	 String sql="insert into asigurare values ("+i+","+(random.nextInt(30)+1)+","+(random.nextInt(100)+1)+",'"+firme_asigurare_random+"','"+tipuri_asigurare_random+"',"+durata_asigurare+","+pret_asigurare+");";
	        	 stmt.executeUpdate(sql);	         } 
	    	  for(int i=1;i<=15;i++) {
		        	 long days = from.until(to, ChronoUnit.DAYS);
		        	 long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
		        	 LocalDate randomDate = from.plusDays(randomDays);
		        	 String dataRandom = randomDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    		  int id_uri_masini_testdrive_random = id_uri_masini_testdrive[random.nextInt(id_uri_masini_testdrive.length)];
	    		  int iduri_cons_random=iduri_cons[random.nextInt(iduri_cons.length)];
	    		  String sql="insert into test_drive values ("+i+","+(random.nextInt(30)+1)+","+iduri_cons_random+","+id_uri_masini_testdrive_random+",STR_TO_DATE('"+dataRandom+"','%d/%m/%Y'),"+(random.nextInt(5)+1)+");";
	    		  			 //insert into angajat values (2,3,'Popa','Ştefania',STR_TO_DATE('25/12/1997','%d/%m/%Y'),42)
	    		  stmt.executeUpdate(sql);
	    	  }*/
	    	  for(int i=1;i<=100;i++) {
		        	 long days = from.until(to, ChronoUnit.DAYS);
		        	 long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
		        	 LocalDate randomDate = from.plusDays(randomDays);
		        	 String dataRandom = randomDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    		  int iduri_cons_random=iduri_cons[random.nextInt(iduri_cons.length)];
	    		  String modalitate_plata_random=modalitate_plata[random.nextInt(modalitate_plata.length)];
	    		  final int preturi = random.nextInt(30000)+20000;
	    		  String sql="insert into VANZARE_MASINA values ("+i+","+(random.nextInt(30)+1)+","+iduri_cons_random+","+(random.nextInt(100)+1)+",STR_TO_DATE('"+dataRandom+"','%d/%m/%Y'),"+preturi+",'"+modalitate_plata_random+"');";
	    		  //insert into angajat values (2,3,'Popa','Ştefania',STR_TO_DATE('25/12/1997','%d/%m/%Y'),42)
	    		  stmt.executeUpdate(sql);
	    	  }
	    	 /* for (int i=1;i<=15;i++) {
	    		  String codMotorRandom = coduri_motor[random.nextInt(coduri_motor.length)];
	    		  int mecaniciRandom = mecanici[random.nextInt(mecanici.length)];
	    		  long days = from.until(to, ChronoUnit.DAYS);
		        	 long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
		        	 LocalDate randomDate = from.plusDays(randomDays);
		        	 String dataRandom = randomDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		        	 String modalitate_plata_random=modalitate_plata[random.nextInt(modalitate_plata.length)];
	    		  String sql = "insert into SERVICE values("+i+","+(random.nextInt(30)+1)+","+mecaniciRandom+",STR_TO_DATE('"+dataRandom+"','%d/%m/%Y'),"+random.nextInt(250)+",'blablabla"+"');";
	    		  stmt.executeUpdate(sql);
	    	  }
	    	  */
	         } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}
