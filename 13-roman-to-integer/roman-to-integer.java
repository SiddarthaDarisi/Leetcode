class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int number = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            number += switch (c) {
                case 'I' -> {
                    if (i + 1 < length && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                        if (s.charAt(i + 1) == 'V') {
                            i++;
                            yield 4;
                        } else {
                            i++;
                            yield 9;
                        }
                    } else {
                        yield 1;
                    }
                }
                case 'V' -> 5;
                case 'X' -> {
                    if (i + 1 < length && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                        if (s.charAt(i + 1) == 'L') {
                            i++;
                            yield 40;
                        } else {
                            i++;
                            yield 90;
                        }
                    } else {
                        yield 10;
                    }
                }
                case 'L' -> 50;
                case 'C' -> {
                    if (i + 1 < length && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        if (s.charAt(i + 1) == 'D') {
                            i++;
                            yield 400;
                        } else {
                            i++;
                            yield 900;
                        }
                    } else {
                        yield 100;
                    }
                }
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (i >= length - 1) {
                break;
            }
        }
        return number;
    }
}
