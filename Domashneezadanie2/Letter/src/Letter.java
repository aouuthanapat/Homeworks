class Letter {
    public static void main(String[] args) {
        String str = "По связи между частями сложные предложения делятся на два типа";
        char ch = 'с';
        int cnt = 0;

        for ( int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                cnt++;
        }
        System.out.println("Кол-во символов "+ch+" составляет " +cnt);
    }
}
