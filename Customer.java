package oops_assignment;

 class Customer extends AddressAE  {

	
		private String customerName;
		private String residentialAddress;
		
		public Customer()
		{
			
		}

		/**
		 * @param customerName
		 * @param residentialAddress
		 */
		public Customer(String customerName, String residentialAddress) {
			super();
			this.customerName = customerName;
			this.residentialAddress = residentialAddress;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getResidentialAddress() {
			return residentialAddress;
		}

		public void setResidentialAddress(String residentialAddress) {
			this.residentialAddress = residentialAddress;
		}
		
		public void getCustomerDetails()
		{
			System.out.println(customerName);
			getAddressDetails();
		}
		
		
	}


