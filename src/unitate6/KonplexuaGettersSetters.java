package ebaluazioa2.ariketa1.GettersSetters;

import java.util.Objects;
import java.util.Scanner;

public class KonplexuaGettersSetters {
	
	private double erreala;
	private double irudikaria;	

		public KonplexuaGettersSetters() {	
		}
		
		public KonplexuaGettersSetters(double erreala, double irudikaria) {
			super();
			this.erreala = erreala;
			this.irudikaria = irudikaria;
		}

		public double getErreala() {
			return erreala;
		}

		public void setErreala(double erreala) {
			this.erreala = erreala;
		}
	
		public double getIrudikaria() {
			return irudikaria;
		}
	
		public void setIrudikaria(double irudikaria) {
			this.irudikaria = irudikaria;
		}

		
		
		public void kendu(double e, double i) {
			this.erreala=this.erreala-e;
			this.irudikaria=this.irudikaria-i;
		}

		
		@Override
		public String toString() {
			return "KonplexuaGettersSetters [erreala=" + erreala + ", irudikaria=" + irudikaria + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(erreala, irudikaria);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			KonplexuaGettersSetters other = (KonplexuaGettersSetters) obj;
			return Double.doubleToLongBits(erreala) == Double.doubleToLongBits(other.erreala)
					&& Double.doubleToLongBits(irudikaria) == Double.doubleToLongBits(other.irudikaria);
		}

	

}
