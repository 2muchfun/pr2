package de.bht.pr2.lab04;

import java.io.*;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;
public class ObjectSerde {
    public void serialize(Certificate certificate, String path)
    {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);


            bw.write(certificate.toString()); // Schoen formatiert
            //bw.write(hauptJSONObject.toString()); // Keine Baum-Struktur
            bw.newLine();

            // Aufraeumen
            bw.close();
            osw.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String deserialize(String path)
    {
        // Als "ganz normale" Text-Datei mit java.io einlesen
        try {
            // JSON-Datei einlesen
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            StringBuilder gesamterInhalt = new StringBuilder();

            String line = "";
            while ((line = br.readLine()) != null) {
                gesamterInhalt.append(line);
            }

            // Aufraeumen
            br.close();
            isr.close();
            fis.close();

            // JSON-Objekt erzeugen
            //JSONObject hauptJSONObject = new JSONObject(gesamterInhalt.toString());
            return gesamterInhalt.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
