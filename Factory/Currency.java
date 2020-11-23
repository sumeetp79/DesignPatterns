public enum Currency { PENNY(1), NICKLE(1), DIME(10), QUARTER(25); 
private int value; private Currency(int value) { this.value = value; } };