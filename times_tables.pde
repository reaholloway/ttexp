int rows = 3;
int cols = 5;
int exp = 3;
long [][] tt;

void setup() {
  tt = TTE.ttexp(rows, cols, exp);
  print_ttexp();
}

void draw() {
}

void print_ttexp() {
  for (long [] r : tt) {
    for (long c : r) {
      System.out.print("\t" + c);
    }
    System.out.println();
  }
}
