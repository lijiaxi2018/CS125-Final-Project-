package com.example.lijiaxi.githubanother;

public class QuestionLiarbry {
    private String[] questions = {
            "what is UIUC’s national ranking in 2019?",
            "what is the size of undergrad students in UIUC?",
            "what is out student-to-faculty ratio?",
            "how many Nobel Prize winners among faculty and alumni?",
            "how many Pulitzer Prize winners among faculty and alumn?",
            "what is the ranking of Engineering program in the U.S.?",
            "we have students from how many countries in the world?",
            "what is the percentage of students participated in research?",
            "which year was UIUC founded?",
            "how many residence halls do we have?"

};

    private String[][] choice = {
            {"58", "63", "39", "46"},
            {"33,600", "27,500", "35,700", "35,000"},
            {"1:10", "1:13", "1:15", "1:18"},
            {"15", "23", "12", "25"},
            {"15", "23", "12", "25"},
            {"4", "6", "7", "13"},
            {"35", "42", "54", "65"},
            {"33%", "25%", "47%", "68%"},
            {"1867", "1868", "1883", "1885"},
            {"15", "18", "22", "24"},
        };

    private String[] correct = {
            "63",
            "33,600",
            "1:18",
            "23",
            "25",
            "6",
            "65",
            "68%",
            "1867",
            "24",
        };

    public String getQuestion(int a) {
        String que = questions[a];
        return que;
    }

    public String getChoice1(int a) {
        String cho1 = choice[a][0];
        return cho1;
    }

    public String getChoice2(int a) {
        String cho2 = choice[a][1];
        return cho2;
    }

    public String getChoice3(int a) {
        String cho3 = choice[a][2];
        return cho3;
    }

    public String getChoice4(int a) {
        String cho3 = choice[a][3];
        return cho3;
    }

    public String getCorrect(int a) {
        String answer = correct[a];
        return answer;
    }
}
