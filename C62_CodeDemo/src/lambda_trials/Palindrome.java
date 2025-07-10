//Program to define generic functional interface Palindrome

package lambda_trials;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
