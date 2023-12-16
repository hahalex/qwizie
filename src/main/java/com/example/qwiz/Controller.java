package com.example.qwiz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Button answerBtn;
    @FXML
    private ToggleGroup answers;
    @FXML
    private Button cplusBtn;
    @FXML
    private Button csharpBtn;
    @FXML
    private Button javaBtn;
    @FXML
    private Button jsBtn;
    @FXML
    private Button pythonBtn;
    @FXML
    private Text questionsText;
    @FXML
    private RadioButton radio_btn_1;
    @FXML
    private RadioButton radio_btn_2;
    @FXML
    private RadioButton radio_btn_3;
    @FXML
    private RadioButton radio_btn_4;
    @FXML
    private Text sheeh_text;


    final Questions[] questionsJava = new Questions[] {
            new Questions("В каком из вариантов представлен корректный формат вывода информации на экран?",
                    new String[] {
                            "Console.Write()",
                            "print()",
                            "console.log()",
                            "System.out.println()"
                    }),
            new Questions("Какой тип данных отвечает за целые числа?",
                    new String[] {
                            "String",
                            "Float",
                            "Boolean",
                            "Integer"
                    }),
            new Questions("Где правильно присвоено новое значение к многомерному массиву?",
                    new String[] {
                            "a(0)(0) = 1;",
                            "a[0 0] = 1;",
                            "a{0}{0} = 1;",
                            "a[0][0] = 1;"
                    }),
            new Questions("Какой метод позволяет запустить программу на Java?",
                    new String[] {
                            "Основного метода нет",
                            "С класса, что был написан первым и с методов что есть внутри него",
                            "Любой, его можно задавать в настройках проекта",
                            "С метода main в любом из классов"
                    }),
            new Questions("Каждый файл должен называется...",
                    new String[] {
                            "по имени первой библиотеки в нём",
                            "по имени названия пакета",
                            "как вам захочется",
                            "по имени класса в нём"
                    }),
            new Questions("Сколько параметров может принимать функция?",
                    new String[] {
                            "5",
                            "10",
                            "20",
                            "неограниченное количество"
                    })
    };

    final Questions[] questionsPython = new Questions[] {
            new Questions("Как получить данные от пользователя?",
                    new String[] {
                            "Использовать метод get()",
                            "Использовать метод cin()",
                            "Использовать метод read()",
                            "Использовать метод input()"
                    }),
            new Questions("Имеется кортеж вида T = (4, 2, 3). Какая из операций приведёт к тому, что имя T будет ссылаться на кортеж (1, 2, 3)?",
                    new String[] {
                            "T[0] = 1",
                            "T = (1) + T[1:]",
                            "T.startswith(1)",
                            "T = (1,) + T[1:]"
                    }),
            new Questions("Для чего в Python используется встроенная функция enumerate()?",
                    new String[] {
                            "Для определения количества элементов последовательности",
                            "Для сортировки элементов по значениям id",
                            "Для вывода текста",
                            "Для одновременного итерирования по самим элементам и их индексам"
                    }),
            new Questions("Необходимо собрать и вывести все уникальные слова из строки рекламного текста. Какой из перечисленных типов данных Python подходит лучше всего?",
                    new String[] {
                            "кортеж (tuple)",
                            "список (list)",
                            "словарь (dict)",
                            "множество (set)"
                    }),
            new Questions("Как вывести список методов и атрибутов объекта x?",
                    new String[] {
                            "help(x)",
                            "info(x)",
                            "?x",
                            "dir(x)"
                    }),
            new Questions("Какая из перечисленных инструкций выполнится быстрее всего, если n = 10**6?",
                    new String[] {
                            "a = list(i for i in range(n))",
                            "a = [i for i in range(n)]",
                            "a = {i for i in range(n)}",
                            "a = (i for i in range(n))"
                    })
    };

    final Questions[] questionsJS = new Questions[] {
            new Questions("Что такое JavaScript?",
                    new String[] {
                            "Графический редактор для создания изображений",
                            "Веб-браузер для просмотра интернет-сайтов",
                            "Операционная система для мобильных устройств",
                            "Язык программирования для создания динамических веб-страниц"
                    }),
            new Questions("Как объявить переменную в JavaScript?",
                    new String[] {
                            "var x;",
                            "const x",
                            "int x",
                            "let x"
                    }),
            new Questions("Какой символ используется для комментариев в JavaScript?",
                    new String[] {
                            "--",
                            "**",
                            "##",
                            "//"
                    }),
            new Questions("Что вернет оператор typeof для строки?",
                    new String[] {
                            "\"undefined\"",
                            "\"number\"",
                            "\"boolean\"",
                            "\"string\""
                    }),
            new Questions("Какая функция используется для вывода данных в консоль браузера?",
                    new String[] {
                            "log()",
                            "print()",
                            "alert()",
                            "console.log()"
                    }),
            new Questions("Какая функция позволяет преобразовать строку в число в JavaScript?",
                    new String[] {
                            "Number()",
                            "toString()",
                            "parseFloat()",
                            "parseInt()"
                    })
    };

    final Questions[] questionsCplus = new Questions[] {
            new Questions("Что такое C++?",
                    new String[] {
                            "Операционная система",
                            "Компилятор",
                            "Библиотека функций",
                            "Язык программирования"
                    }),
            new Questions("Как объявить целочисленную переменную в C++?",
                    new String[] {
                            "var x",
                            "float x",
                            "string x",
                            "int x"
                    }),
            new Questions("Что делает оператор \"<<\" в C++?",
                    new String[] {
                            "Считывает данные с клавиатуры",
                            "Выполняет математическую операцию",
                            "Создает новую переменную",
                            "Выводит данные на экран"
                    }),
            new Questions("Какой символ используется для комментариев в C++?",
                    new String[] {
                            "||",
                            "--",
                            "**",
                            "//"
                    }),
            new Questions("Что делает оператор \"for\" в C++?",
                    new String[] {
                            "Выполняет условный оператор",
                            "Объявляет функцию",
                            "Сортирует массив",
                            "Выполняет цикл"
                    }),
            new Questions("Какой оператор используется для выделения динамической памяти в C++?",
                    new String[] {
                            "malloc",
                            "alloc",
                            "create",
                            "new"
                    })
    };

    final Questions[] questionsCcharp = new Questions[] {
            new Questions("Какая из следующих конструкций используется для объявления целочисленной переменной в C#?",
                    new String[] {
                            "float",
                            "string",
                            "var",
                            "int"
                    }),
            new Questions("Какой оператор используется для сравнения значений в C#?",
                    new String[] {
                            "!=",
                            "=",
                            ">",
                            "=="
                    }),
            new Questions("Как объявить метод с возвращаемым значением в C#?",
                    new String[] {
                            "void methodName()",
                            "methodName()",
                            "return()",
                            "int methodName()"
                    }),
            new Questions("Какой модификатор доступа используется для классов, к которым можно обращаться только изнутри текущей сборки?",
                    new String[] {
                            "public",
                            "private",
                            "protected",
                            "internal"
                    }),
            new Questions("Какой оператор используется для создания нового экземпляра объекта в C#?.",
                    new String[] {
                            "create",
                            "instance",
                            "object",
                            "new"
                    }),
            new Questions("Какой из следующих циклов в C# выполняется, только пока условие истинно?",
                    new String[] {
                            "for",
                            "do-while",
                            "switch",
                            "while"
                    })
    };

    private int nowQuestion = 0, correctAnswers;
    private String nowCorrectAnswer;
    private Questions[] questions = new Questions[] {};

    private void CheckQwiz(Questions[] nowQuestions) {
        radio_btn_1.setVisible(true);
        radio_btn_2.setVisible(true);
        radio_btn_3.setVisible(true);
        radio_btn_4.setVisible(true);

        answerBtn.setVisible(true);

        nowQuestion = 0;
        correctAnswers = 0;

        questions = nowQuestions;
        nowCorrectAnswer = nowQuestions[nowQuestion].correctAnswer();
        questionsText.setText(questions[nowQuestion].getQuestions());
        String[] answers = questions[nowQuestion].getAnswers();

        List<String> stringList = Arrays.asList(answers);

        Collections.shuffle(stringList);
        System.out.println(nowQuestion);
        System.out.println(nowCorrectAnswer);

        radio_btn_1.setText(stringList.get(0));
        radio_btn_2.setText(stringList.get(1));
        radio_btn_3.setText(stringList.get(2));
        radio_btn_4.setText(stringList.get(3));

    };

    @FXML
    void initialize() {

        radio_btn_1.setVisible(false);
        radio_btn_2.setVisible(false);
        radio_btn_3.setVisible(false);
        radio_btn_4.setVisible(false);
        answerBtn.setVisible(false);

        javaBtn.setOnAction(event -> {
            sheeh_text.setText("Это жаба, она крякает");
            CheckQwiz(questionsJava);
        });

        jsBtn.setOnAction(event -> {
            sheeh_text.setText("JS - это JASON STATHAM, и он запрещает");
            CheckQwiz(questionsJS);
        });

        cplusBtn.setOnAction(event -> {
            sheeh_text.setText("С++? А где минусы?");
            CheckQwiz(questionsCplus);
        });

        csharpBtn.setOnAction(event -> {
            sheeh_text.setText("Надел C тюремную робу, а она ему как С#");
            CheckQwiz(questionsCcharp);
        });

        pythonBtn.setOnAction(event -> {
            sheeh_text.setText("Кто додумался запихать змею в компьютер?");
            CheckQwiz(questionsPython);
        });


        answerBtn.setOnAction(event -> {
            //нажали на кнопку
            RadioButton selectedRadio = (RadioButton) answers.getSelectedToggle();
            if(selectedRadio != null) {
                String toogleGroupValue = selectedRadio.getText();

                if (toogleGroupValue.equals(nowCorrectAnswer)) {
                    System.out.println("Верный ответ");
                    correctAnswers++;
                } else {
                    System.out.println("Неверный ответ");
                }

                if (nowQuestion + 1 == questions.length) {
                    radio_btn_1.setVisible(false);
                    radio_btn_2.setVisible(false);
                    radio_btn_3.setVisible(false);
                    radio_btn_4.setVisible(false);

                    answerBtn.setVisible(false);
                    selectedRadio.setSelected(false);

                    questionsText.setText("Вы ответили корректно на " + correctAnswers + " из " + questions.length + " вопросов!");
                } else {
                    nowQuestion++;
                    nowCorrectAnswer = questions[nowQuestion].correctAnswer();
                    questionsText.setText(questions[nowQuestion].getQuestions());

                    String[] answers = questions[nowQuestion].getAnswers();

                    List<String> stringList = Arrays.asList(answers);

                    Collections.shuffle(stringList);
                    System.out.println(nowQuestion);
                    System.out.println(nowCorrectAnswer);

                    radio_btn_1.setText(stringList.get(0));
                    radio_btn_2.setText(stringList.get(1));
                    radio_btn_3.setText(stringList.get(2));
                    radio_btn_4.setText(stringList.get(3));

                    selectedRadio.setSelected(false);
                }
            }
    });

    }
}
