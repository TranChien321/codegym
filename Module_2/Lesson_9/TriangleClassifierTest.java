package Lesson_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classify() {
    }

    @Test
    void testEquilateralTriangle() {
        assertEquals("Tam giác Đều", TriangleClassifier.classify(2, 2, 2));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Tam giác Cân", TriangleClassifier.classify(2, 2, 3));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("Tam giác Thường", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    void testNotTriangle1() {
        assertEquals("Không là tam giác", TriangleClassifier.classify(8, 2, 3));
    }

    @Test
    void testNotTriangle2() {
        assertEquals("Không là tam giác", TriangleClassifier.classify(-1, 2, 1));
    }

    @Test
    void testNotTriangle3() {
        assertEquals("Không là tam giác", TriangleClassifier.classify(0, 1, 2));
    }
}