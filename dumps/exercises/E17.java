	
	// Given the following class:
	class CheckingAccount {
		public int amount;

		public CheckingAccount(int amount) {
			this.amount = amount;
		}

		public int getAmount() {
			return amount;
		}

		public void changeAmount(int x) {
			amount += x;
		}
	}

	class Test {
		public static void main(String[] args) {
			CheckingAccount acct = new CheckingAccount((int) (Math.random()*1000));
			// line n1
			System.out.println(acct.getAmount());
		}
	}
	/* Which three lines, when inserted independently at line n1, cause the program
	   to print a o balance ?
		A) this.amount = 0;
		B) amount = 0;
		C) acct(0);
		D) acct.amount = 0;
		E) acct.getAmount() = 0;
		F) acct.changeAmount(0);
		G) acct.changeAmount(-acct.amount);
		H) acct.changeAmount(-acct.getAmount());
	*/
