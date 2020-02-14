package com.qa.ims.persistence.domain;

  public class Items {

		private long id;
		private String item_name;
		private Double item_value;
		
		
  public Items( String item_name, Double item_value) {
			
		this.item_name = item_name;
		this.item_value = item_value;		
		}
		
  public Items(Long id, String items_name, Double item_value) {
		
		this.id=id;
		this.item_name = items_name;
		this.item_value = item_value;
		
		}
		
		
	


		public long getId() {
			return id;
		}
		public void setId(long l) {
			this.id = l;
		}
		public String getItem_name() {
			return item_name;
		}
		public void setItem_name(String items_name) {
			this.item_name = items_name;
		}
		public Double getItem_value() {
			return item_value;
		}
		public Double setItem_value(Double item_value) {
			return item_value;
		}
		
		public String toString() {
			return "id:" + id + " item_name:" + item_name + " item_value:" + item_value;
		}

		public static void add(Items items) {
			
		}

		public void setId(Object object) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
			result = prime * result + ((item_value == null) ? 0 : item_value.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Items other = (Items) obj;
			if (id != other.id)
				return false;
			if (item_name == null) {
				if (other.item_name != null)
					return false;
			} else if (!item_name.equals(other.item_name))
				return false;
			if (item_value == null) {
				if (other.item_value != null)
					return false;
			} else if (!item_value.equals(other.item_value))
				return false;
			return true;
		}	
		
		
		
		
		
		
	}
