package com.revature.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StringExercises {

    public static void main(String[] args) {


        // Create a String variable and print its length to the console


        // Create a String and use the substring method to return only the second half of the string


        // Create a String that is an entire sentence. Make a character array (i.e. char[]) from your String so that each element in the array is a single word
        // print out each element in the array to make sure it worked



        // Make an array of Strings String[] from the same sentence. And print out each element in the array to make sure it worked



        // Take the below string and manipulate it so that your final string is only the protocol and domain name (i.e. https://www.google.com)
        // Then manipulate it again to only be the content after the domain (i.e. search?q...)
        // Extra challenge: split the string up to pull out each query parameter (q=mario, rlz=1c1GCEU_en___US946, etc.)
        // store the key=value pair in a HashMap (i.e. Map<String, String>) -> your result should print out like this:
        // {sourceid=chrome, q=mario, rlz=1C1GCEU_en___US946, oq=mario, aqs=chrome.0.0i355i512j46i512j35i39i362l3j46i10i131i199i433i465j0i10i433j46i512j0i512j46i512.607j0j15, ie=UTF-8}
        String url = "https://www.google.com/search?q=mario&rlz=1C1GCEU_en___US946&oq=mario&aqs=chrome.0.0i355i512j46i512j35i39i362l3j46i10i131i199i433i465j0i10i433j46i512j0i512j46i512.607j0j15&sourceid=chrome&ie=UTF-8";


        // using the string array below - create a control flow that will print out the string if it has more than one vowel in it
        // and then another to print strings that have exactly two vowels
        // If you like - you can explore regex patterns
        String[] strings = {"hello", "happy", "sad", "facetious", "elmo", "baboon", "grim", "grime", "YOLO", "ACLU", "clam chowder"};


    }
}
