package main.groovy

class ExecuteProcess {
    static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("git help");
            BufferedReader result = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = result.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
