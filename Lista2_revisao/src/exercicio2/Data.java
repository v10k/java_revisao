package exercicio2;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

public class Data {
	
	private Date Data;
		
	public Data(String data) throws ParseException {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		format.setLenient(false);
		try {
			this.setData(format.parse(data));
		} catch (ParseException e) {
			data = "01/01/0001";
			this.setData(format.parse(data));
		}
	}
	
	public Data(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		format.setLenient(false);
		this.setData(data);
	}
	
	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	
	public int compara(Date data) {
		Date hoje = new Date();
		if (hoje.compareTo(data) == 0) {
            return 0;
        } else if (hoje.compareTo(data) > 0) {
        	return 1;
        } else {
        	return -1;
        }
	}
	
	public int getDia(Date data) {
		LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getDayOfMonth();
	}
	
	public int getMes(Date data) {
		LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getMonthValue();
	}
	
	public String getMesExtenso(Date data) {
		DateFormat df2 = new SimpleDateFormat ("MMMMM", new Locale("pt", "BR"));
		return (df2.format (data)); 
	}
	
	public boolean isBissexto(Date data) {
		LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int ano = localDate.getYear();
		
		if (ano % 4 != 0) {
		    return false;
		  } else if (ano % 400 == 0) {
		    return true;
		  } else if (ano % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
	}
	
	public Data clone(Data data) {
		Date novaData = data.getData();
		return new Data(novaData);
	}

	
	
	
	
}
