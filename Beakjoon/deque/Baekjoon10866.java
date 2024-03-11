package ch01.Beakjoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Baekjoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    if (deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.pollFirst()).append("\n");
                    break;

                case "pop_back":
                    if (deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.pollLast()).append("\n");
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    if (deque.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;

                case "front":
                    if (deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.peekFirst()).append("\n");
                    break;

                case "back":
                    if (deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
