package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    private static final String PATH = "e:\\Еременко\\000\\IOStream_my\\input.txt"; // указываем путь к файлу с которым мы будем работать
    private static final String PATHOUT = "e:\\Еременко\\000\\IOStream_my\\output.css"; // путь к файлу, в который будем записывать

    private static inputStream streamInput;
    private static outputStream streamOutput;

    public static void main(String... args) throws IOException {
        streamInput = new inputStream(PATH);// инициализируем наш класс для работы с файлом
        streamOutput = new outputStream(PATHOUT);
        streamOutput.write(streamInput.read());
    }
}
