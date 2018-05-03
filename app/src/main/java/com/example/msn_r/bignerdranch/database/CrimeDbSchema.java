package com.example.msn_r.bignerdranch.database;

public class CrimeDbSchema {
    public static final class CrimeTable{
        public static final String Name="crimes";
        public static final class Cols{
            public static final String UUID="uuid";
            public static final String TITLE="title";
            public static final String DATE="date";
            public static final String SOLVED="solved";
        }
    }
}
