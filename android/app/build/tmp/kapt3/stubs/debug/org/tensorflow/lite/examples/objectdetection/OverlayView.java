package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\rJ\b\u0010%\u001a\u00020\u001fH\u0002J$\u0010&\u001a\u00020\u001f2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/OverlayView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bounds", "Landroid/graphics/Rect;", "boxPaint", "Landroid/graphics/Paint;", "detectedItems", "", "", "getDetectedItems", "()Ljava/util/List;", "setDetectedItems", "(Ljava/util/List;)V", "groceryStoreItems", "", "Lorg/tensorflow/lite/examples/objectdetection/OverlayView$Item;", "getGroceryStoreItems", "results", "Lorg/tensorflow/lite/task/vision/detector/Detection;", "scaleFactor", "", "textBackgroundPaint", "textPaint", "totalBill", "", "clear", "", "draw", "canvas", "Landroid/graphics/Canvas;", "getItemPrice", "itemName", "initPaints", "setResults", "detectionResults", "imageHeight", "", "imageWidth", "Companion", "Item", "app_debug"})
public final class OverlayView extends android.view.View {
    private java.util.List<? extends org.tensorflow.lite.task.vision.detector.Detection> results;
    private android.graphics.Paint boxPaint;
    private android.graphics.Paint textBackgroundPaint;
    private android.graphics.Paint textPaint;
    private float scaleFactor = 1.0F;
    private android.graphics.Rect bounds;
    private double totalBill = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> detectedItems;
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.lite.examples.objectdetection.OverlayView.Companion Companion = null;
    private static final int BOUNDING_RECT_TEXT_PADDING = 8;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.tensorflow.lite.examples.objectdetection.OverlayView.Item> groceryStoreItems = null;
    
    public OverlayView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDetectedItems() {
        return null;
    }
    
    public final void setDetectedItems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final void clear() {
    }
    
    private final void initPaints() {
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<org.tensorflow.lite.task.vision.detector.Detection> detectionResults, int imageHeight, int imageWidth) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.tensorflow.lite.examples.objectdetection.OverlayView.Item> getGroceryStoreItems() {
        return null;
    }
    
    public final double getItemPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String itemName) {
        return 0.0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/OverlayView$Item;", "", "name", "", "price", "", "(Ljava/lang/String;D)V", "getName", "()Ljava/lang/String;", "getPrice", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Item {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final double price = 0.0;
        
        @org.jetbrains.annotations.NotNull()
        public final org.tensorflow.lite.examples.objectdetection.OverlayView.Item copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, double price) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Item(@org.jetbrains.annotations.NotNull()
        java.lang.String name, double price) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        public final double getPrice() {
            return 0.0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/OverlayView$Companion;", "", "()V", "BOUNDING_RECT_TEXT_PADDING", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}