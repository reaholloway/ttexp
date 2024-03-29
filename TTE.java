class TTE {

  public static long [][] ttexp(int rows_, int cols_, int exp_) {
    long [][] tt = new long [rows_] [cols_];
    for (int r = 0; r < rows_; r++) {
      for (int c = 0; c < cols_; c++) {
        long num = (r*cols_) + c + 1;
        tt[r][c] = (long) Math.pow(num, exp_);
      }
    }
    return tt;
  }
}
