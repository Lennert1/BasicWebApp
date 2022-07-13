package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("which of the following numbers is the largest: ")) {
            String q = query.toString();
            String[] spilt = q.split(": ");
            spilt = spilt[1].split(", ");
            int numbers = 0;

            int max = 0;
            for(int i = 0; i < spilt.length; i++) {
                numbers = Integer.parseInt(spilt[i]);
                max = Math.max(max, numbers);
            }


            return Integer.toString(max);
        } else if (query.contains("what is your name")) {
            return "Lennert";
        } else if (query.contains("name")) {
                return "MyTeam";
        } else { // TODO extend the programm here
            return "";
        }
    }
}
