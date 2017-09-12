	
	// Given the following two classes:
	public class Customer {
		ElectricAccount acct = new ElectricAccount();

		public void useElectricity(double kwh) {
			acct.addKWh(kwh);
		}
	}

	public class ElectricAccount {
		private double kwh;
		private double rate = 0.07;
		private double bill;

		// line n1
	}
	
	/*  How should you write methods in the ElectricAccount class at line n1 
		so that the member variable bill is always equal to the value of the 
		member variable kwh multiplied by the member variable rate?

		Any amount of electricity used by a customer (represented by an instance 
		of the customer class) must contribute to the customer's bill (represented 
		by the member variable bill) through the method useElectricity method. An 
		instance of the customer class should never be able to tamper with or decrease 
		the value of the member variable bill                                             */

		// A
		public void addKwh(double kwh) {
			this.kwh += kwh;
			this.bill = this.kwh * this.rate;
		}

		// B
		public void addKwh(double kwh) {
			if(kwh > 0) {
				this.kwh += kwh;
				this.bill = this.kwh * this.rate;
			}
		}

		// C
		private void addKwh(double kwh) {
			if(kwh > 0) {
				this.kwh += kwh;
				this.bill = this.kwh * this.rate;
			}
		}

		// D
		public void addKwh(double kwh) {
			if(kwh > 0) {
				this.kwh += kwh;
				setBill(this.kwh);
			}
		}
		public void setBill(double kwh) {
			bill = kwh * rate;
		}