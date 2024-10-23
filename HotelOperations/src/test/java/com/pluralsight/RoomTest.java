package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

   @Test
    public void room_should_be_occupied_whenCheckedin(){
       //arrange
       Room room = new Room(2,120,false,false);
       //act
        room.checkIn();
       //assert
       assertTrue(room.isOccupied());
    }

    @Test
    public void room_should_be_dirty_whenCheckedin(){
        //arrange
        Room room = new Room(2,120,false,false);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_fails_whenOccupied(){
        //arrange
        Room room = new Room(2,120,true,true);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied());
    }

    @Test
    public void checkIn_fails_whenDirty(){
        //arrange
        Room room = new Room(2,120,false,true);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isDirty());
    }

    @Test
    public void checkedOutRoom_isAvailable_afterCleaned(){
        //arrange
        Room room = new Room(2,120,false,false);
        room.checkIn();
        room.checkOut();
        //act
        room.cleanRoom();
        //assert
        assertTrue(room.isAvailable());
   }

    @Test
    public void checkedOutRoom_isNotAvailable_beforeCleaned(){
        //arrange
        Room room = new Room(2,120,false,false);
        room.checkIn();
        room.checkOut();
        //act
        room.checkIn();
        //assert
        assertFalse(room.isAvailable());
    }

    @Test
    public void cleanRoom_returns_notDirty_whenDirty(){
        //arrange
        Room room = new Room(2,120,false,true);
        //act
        room.cleanRoom();
        //assert
        assertFalse(room.isDirty());
    }

    @Test
    public void cleanRoom_returns_notDirty_whenNotDirty(){
        //arrange
        Room room = new Room(2,120,false,false);
        //act
        room.cleanRoom();
        //assert
        assertFalse(room.isDirty());
    }

    @Test
    public void checkedOutRoom_returns_NotOccupied(){
        //arrange
        Room room = new Room(2,120,true,true);
        //room.checkIn();
        //act
        room.checkOut();
        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void checkedOutRoom_returns_dirty(){
        //arrange
        Room room = new Room(2,120,true,true);
        //room.checkIn();
        //act
        room.checkOut();
        //assert
        assertTrue(room.isDirty());
    }


}