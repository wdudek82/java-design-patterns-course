package com.company.BehavioralPatterns.AdapterPattern;

import com.company.BehavioralPatterns.AdapterPattern.Example1.*;
import com.company.BehavioralPatterns.AdapterPattern.Example2.Calculator;
import com.company.BehavioralPatterns.AdapterPattern.Example2.CalculatorAdapter;
import com.company.BehavioralPatterns.AdapterPattern.Example2.Rectangle;
import com.company.BehavioralPatterns.AdapterPattern.Example2.Triangle;
import com.company.BehavioralPatterns.AdapterPattern.Example3.Adapter;
import com.company.BehavioralPatterns.AdapterPattern.Example3.IntegerValue;
import com.company.BehavioralPatterns.AdapterPattern.Example3.IntegerValueInterface;
import com.company.BehavioralPatterns.AdapterPatternChallenge.*;

import javax.print.attribute.standard.Media;

public class Demo {
    public static void run() {
        // firstExample();
        // secondExample();
        thirdExample();
    }

    public static void runChallenge() {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "random_song");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        AdvancedMediaPlayer mp4Player = new Mp4Player();

        MediaPlayer advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter1.play("vlc", "random_song_2");

        MediaPlayer advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter2.play("mp4", "random_song_3");
        advancedMediaPlayerAdapter2.play("avi", "random_song_4");
    }

    private static void firstExample() {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testObjMethods(mallardDuck, "Mallard Duck");
        testObjMethods(turkeyAdapter, "Turkey");
    }

    private static void testObjMethods(Duck duck, String duckName) {
        System.out.println("\n:: This is the " + duckName);
        duck.quack();
        duck.fly();
    }

    private static void secondExample() {
        Rectangle rectangle = new Rectangle(20, 10);
        Triangle triangle = new Triangle(20, 10);

        Calculator calculator = new Calculator();
        double result = calculator.getArea(rectangle);
        System.out.println("Result: " + result);

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter(triangle);
        double result2 = calculatorAdapter.getArea(null);
        System.out.println("Result " + result2);
    }

    private static void thirdExample() {
        IntegerValueInterface integerValue = new IntegerValue();
        System.out.println("IntergerValue: " + integerValue.getInteger());

        Adapter adapter = new Adapter();
        System.out.println("Adapter: " + adapter.getInteger());
    }
}
