package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        questionList.add(
            Question(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina, //Get the image for the question
                "Argentina",
                "Australia",
                "Germany",
                "Philippines",
                1
            )
        )

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia, //Get the image for the question
            "Argentina",
            "Australia",
            "Germany",
            "Philippines",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark, //Get the image for the question
            "Argentina",
            "Denmark",
            "Germany",
            "Philippines",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium, //Get the image for the question
            "Belgium",
            "Australia",
            "Germany",
            "Philippines",
            1
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india, //Get the image for the question
            "Argentina",
            "Australia",
            "Kuwait",
            "India",
            4
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait, //Get the image for the question
            "Fiji",
            "Australia",
            "Kuwait",
            "Philippines",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji, //Get the image for the question
            "Argentina",
            "Fiji",
            "Germany",
            "Philippines",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand, //Get the image for the question
            "Argentina",
            "New Zealand",
            "Japan",
            "Brazil",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia, //Get the image for the question
            "Argentina",
            "Australia",
            "Germany",
            "Philippines",
            2
        )

        questionList.add(que9)

        return questionList
    }
}