package xogameclient;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class onlineGameBase extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final AnchorPane anchorPane;
    protected final Button cell_0_0;
    protected final AnchorPane anchorPane0;
    protected final Button cell_0_1;
    protected final AnchorPane anchorPane1;
    protected final Button cell_0_2;
    protected final AnchorPane anchorPane2;
    protected final Button cell_1_2;
    protected final AnchorPane anchorPane3;
    protected final Button cell_1_1;
    protected final AnchorPane anchorPane4;
    protected final Button cell_1_0;
    protected final AnchorPane anchorPane5;
    protected final Button cell_2_0;
    protected final AnchorPane anchorPane6;
    protected final Button cell_2_1;
    protected final AnchorPane anchorPane7;
    protected final Button cell_2_2;
    protected final BorderPane borderPane;
    protected final Text TitleOFScreen;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final Text secondPlayerName;
    protected final Text secondPlayerScore;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final Text firstPlayerName;
    protected final Text firstPlayerScore;
    protected final AnchorPane anchorPane8;
    protected final AnchorPane anchorPane9;
    protected final AnchorPane anchorPane10;
    protected final Button recordButton;
    protected final Button restartButton;
    protected final Button backButton;

    public onlineGameBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        anchorPane = new AnchorPane();
        cell_0_0 = new Button();
        anchorPane0 = new AnchorPane();
        cell_0_1 = new Button();
        anchorPane1 = new AnchorPane();
        cell_0_2 = new Button();
        anchorPane2 = new AnchorPane();
        cell_1_2 = new Button();
        anchorPane3 = new AnchorPane();
        cell_1_1 = new Button();
        anchorPane4 = new AnchorPane();
        cell_1_0 = new Button();
        anchorPane5 = new AnchorPane();
        cell_2_0 = new Button();
        anchorPane6 = new AnchorPane();
        cell_2_1 = new Button();
        anchorPane7 = new AnchorPane();
        cell_2_2 = new Button();
        borderPane = new BorderPane();
        TitleOFScreen = new Text();
        gridPane0 = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        secondPlayerName = new Text();
        secondPlayerScore = new Text();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        firstPlayerName = new Text();
        firstPlayerScore = new Text();
        anchorPane8 = new AnchorPane();
        anchorPane9 = new AnchorPane();
        anchorPane10 = new AnchorPane();
        recordButton = new Button();
        restartButton = new Button();
        backButton = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(400.0);
        setMinWidth(600.0);
        setPrefHeight(400.0);
        setPrefWidth(584.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setGridLinesVisible(true);
        gridPane.setPrefHeight(187.0);
        gridPane.setPrefWidth(200.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_0, 0.0);
        AnchorPane.setLeftAnchor(cell_0_0, 0.0);
        AnchorPane.setRightAnchor(cell_0_0, 0.0);
        AnchorPane.setTopAnchor(cell_0_0, 0.0);
        cell_0_0.setLayoutY(1.0);
        cell_0_0.setMnemonicParsing(false);
        cell_0_0.setPrefHeight(64.0);
        cell_0_0.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane0, 1);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_1, 0.0);
        AnchorPane.setLeftAnchor(cell_0_1, 0.0);
        AnchorPane.setRightAnchor(cell_0_1, 0.0);
        AnchorPane.setTopAnchor(cell_0_1, 0.0);
        cell_0_1.setMnemonicParsing(false);
        cell_0_1.setPrefHeight(64.0);
        cell_0_1.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane1, 2);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_2, 0.0);
        AnchorPane.setLeftAnchor(cell_0_2, 0.0);
        AnchorPane.setRightAnchor(cell_0_2, 0.0);
        AnchorPane.setTopAnchor(cell_0_2, 0.0);
        cell_0_2.setLayoutX(1.0);
        cell_0_2.setMnemonicParsing(false);
        cell_0_2.setPrefHeight(64.0);
        cell_0_2.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane2, 2);
        GridPane.setRowIndex(anchorPane2, 1);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_1_2, 0.0);
        AnchorPane.setLeftAnchor(cell_1_2, 0.0);
        AnchorPane.setRightAnchor(cell_1_2, 0.0);
        AnchorPane.setTopAnchor(cell_1_2, 0.0);
        cell_1_2.setLayoutX(-4.0);
        cell_1_2.setMnemonicParsing(false);
        cell_1_2.setPrefHeight(64.0);
        cell_1_2.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane3, 1);
        GridPane.setRowIndex(anchorPane3, 1);
        anchorPane3.setPrefHeight(200.0);
        anchorPane3.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_1_1, 0.0);
        AnchorPane.setLeftAnchor(cell_1_1, 0.0);
        AnchorPane.setRightAnchor(cell_1_1, 0.0);
        AnchorPane.setTopAnchor(cell_1_1, 0.0);
        cell_1_1.setLayoutX(-14.0);
        cell_1_1.setLayoutY(-13.0);
        cell_1_1.setMnemonicParsing(false);
        cell_1_1.setPrefHeight(64.0);
        cell_1_1.setPrefWidth(90.0);

        GridPane.setRowIndex(anchorPane4, 1);
        anchorPane4.setPrefHeight(200.0);
        anchorPane4.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_1_0, 0.0);
        AnchorPane.setLeftAnchor(cell_1_0, 0.0);
        AnchorPane.setRightAnchor(cell_1_0, 0.0);
        AnchorPane.setTopAnchor(cell_1_0, 0.0);
        cell_1_0.setLayoutX(-2.0);
        cell_1_0.setLayoutY(-8.0);
        cell_1_0.setMnemonicParsing(false);
        cell_1_0.setPrefHeight(64.0);
        cell_1_0.setPrefWidth(90.0);

        GridPane.setRowIndex(anchorPane5, 2);
        anchorPane5.setPrefHeight(200.0);
        anchorPane5.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_2_0, 0.0);
        AnchorPane.setLeftAnchor(cell_2_0, 0.0);
        AnchorPane.setRightAnchor(cell_2_0, 0.0);
        AnchorPane.setTopAnchor(cell_2_0, 0.0);
        cell_2_0.setLayoutX(-24.0);
        cell_2_0.setLayoutY(-12.0);
        cell_2_0.setMnemonicParsing(false);
        cell_2_0.setPrefHeight(64.0);
        cell_2_0.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane6, 1);
        GridPane.setRowIndex(anchorPane6, 2);
        anchorPane6.setPrefHeight(200.0);
        anchorPane6.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_2_1, 0.0);
        AnchorPane.setLeftAnchor(cell_2_1, 0.0);
        AnchorPane.setRightAnchor(cell_2_1, 0.0);
        AnchorPane.setTopAnchor(cell_2_1, 0.0);
        cell_2_1.setLayoutX(8.0);
        cell_2_1.setLayoutY(8.0);
        cell_2_1.setMnemonicParsing(false);
        cell_2_1.setPrefHeight(64.0);
        cell_2_1.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane7, 2);
        GridPane.setRowIndex(anchorPane7, 2);
        anchorPane7.setPrefHeight(200.0);
        anchorPane7.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_2_2, 0.0);
        AnchorPane.setLeftAnchor(cell_2_2, 0.0);
        AnchorPane.setRightAnchor(cell_2_2, 0.0);
        AnchorPane.setTopAnchor(cell_2_2, 0.0);
        cell_2_2.setLayoutX(1.0);
        cell_2_2.setLayoutY(-3.0);
        cell_2_2.setMnemonicParsing(false);
        cell_2_2.setPrefHeight(64.0);
        cell_2_2.setPrefWidth(90.0);
        setCenter(gridPane);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setPrefHeight(151.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(TitleOFScreen, javafx.geometry.Pos.TOP_CENTER);
        TitleOFScreen.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        TitleOFScreen.setStrokeWidth(0.0);
        TitleOFScreen.setText("XO Game");
        TitleOFScreen.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        TitleOFScreen.setWrappingWidth(105.4921875);
        TitleOFScreen.setFont(new Font("System Bold", 24.0));
        BorderPane.setMargin(TitleOFScreen, new Insets(20.0, 0.0, 0.0, 0.0));
        borderPane.setCenter(TitleOFScreen);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setPrefHeight(73.0);
        gridPane0.setPrefWidth(153.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        BorderPane.setMargin(gridPane0, new Insets(60.0, 0.0, 0.0, 0.0));

        secondPlayerName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerName.setStrokeWidth(0.0);
        secondPlayerName.setText(": player2Nmae");
        secondPlayerName.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        secondPlayerName.setWrappingWidth(141.37109375);
        secondPlayerName.setFont(new Font(14.0));

        GridPane.setRowIndex(secondPlayerScore, 1);
        secondPlayerScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerScore.setStrokeWidth(0.0);
        secondPlayerScore.setText(" : Score");
        secondPlayerScore.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        secondPlayerScore.setWrappingWidth(130.13671875);
        secondPlayerScore.setFont(new Font(14.0));
        borderPane.setRight(gridPane0);

        BorderPane.setAlignment(gridPane1, javafx.geometry.Pos.CENTER);
        gridPane1.setPrefHeight(83.0);
        gridPane1.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        BorderPane.setMargin(gridPane1, new Insets(60.0, 0.0, 0.0, 10.0));

        firstPlayerName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerName.setStrokeWidth(0.0);
        firstPlayerName.setText("player1Name :");
        firstPlayerName.setFont(new Font(14.0));

        GridPane.setRowIndex(firstPlayerScore, 1);
        firstPlayerScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerScore.setStrokeWidth(0.0);
        firstPlayerScore.setText("score :");
        firstPlayerScore.setFont(new Font(14.0));
        borderPane.setLeft(gridPane1);
        setTop(borderPane);

        BorderPane.setAlignment(anchorPane8, javafx.geometry.Pos.CENTER);
        anchorPane8.setPrefHeight(234.0);
        anchorPane8.setPrefWidth(168.0);
        setLeft(anchorPane8);

        BorderPane.setAlignment(anchorPane9, javafx.geometry.Pos.CENTER);
        anchorPane9.setPrefHeight(234.0);
        anchorPane9.setPrefWidth(161.0);
        setRight(anchorPane9);

        BorderPane.setAlignment(anchorPane10, javafx.geometry.Pos.CENTER);
        anchorPane10.setPrefHeight(59.0);
        anchorPane10.setPrefWidth(600.0);

        AnchorPane.setLeftAnchor(recordButton, 33.0);
        recordButton.setLayoutX(33.0);
        recordButton.setLayoutY(22.0);
        recordButton.setMnemonicParsing(false);
        recordButton.setPrefHeight(25.0);
        recordButton.setPrefWidth(110.0);
        recordButton.setText("Record Game");

        AnchorPane.setBottomAnchor(restartButton, 12.0);
        AnchorPane.setRightAnchor(restartButton, 100.0);
        AnchorPane.setTopAnchor(restartButton, 22.0);
        restartButton.setLayoutX(444.0);
        restartButton.setLayoutY(22.0);
        restartButton.setMnemonicParsing(false);
        restartButton.setText("Restart");

        AnchorPane.setBottomAnchor(backButton, 12.0);
        AnchorPane.setRightAnchor(backButton, 20.0);
        AnchorPane.setTopAnchor(backButton, 22.0);
        backButton.setLayoutX(524.0);
        backButton.setLayoutY(22.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(25.0);
        backButton.setPrefWidth(54.0);
        backButton.setText("Back");
        setBottom(anchorPane10);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        anchorPane.getChildren().add(cell_0_0);
        gridPane.getChildren().add(anchorPane);
        anchorPane0.getChildren().add(cell_0_1);
        gridPane.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(cell_0_2);
        gridPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(cell_1_2);
        gridPane.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(cell_1_1);
        gridPane.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(cell_1_0);
        gridPane.getChildren().add(anchorPane4);
        anchorPane5.getChildren().add(cell_2_0);
        gridPane.getChildren().add(anchorPane5);
        anchorPane6.getChildren().add(cell_2_1);
        gridPane.getChildren().add(anchorPane6);
        anchorPane7.getChildren().add(cell_2_2);
        gridPane.getChildren().add(anchorPane7);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getChildren().add(secondPlayerName);
        gridPane0.getChildren().add(secondPlayerScore);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getRowConstraints().add(rowConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints5);
        gridPane1.getChildren().add(firstPlayerName);
        gridPane1.getChildren().add(firstPlayerScore);
        anchorPane10.getChildren().add(recordButton);
        anchorPane10.getChildren().add(restartButton);
        anchorPane10.getChildren().add(backButton);

    }
}
