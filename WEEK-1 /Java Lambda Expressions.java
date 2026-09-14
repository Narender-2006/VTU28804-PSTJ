public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (int a) -> {
            if (a < 2) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }
    public PerformOperation isPalindrome() {
        return (int a) -> {
            String original = Integer.toString(a);
            String reversed = new StringBuilder(original).reverse().toString();
            return original.equals(reversed);
        };
    }
