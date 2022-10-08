 public void writeDecryptionFile(String message) throws IOException{
        String decryptFilename = Solution.filepath + "DecryptionFile.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(decryptFilename));
        writer.write(message);
        writer.close();
    }
    public String readEncryptionFile() throws IOException {
        String encryptFilename = Solution.filepath +"EncryptionFile.txt";
        BufferedReader reader = new BufferedReader(new FileReader(encryptFilename));
        String messageFromFile = reader.readLine();
        reader.close();
        return messageFromFile;
    }
