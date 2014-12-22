/*
* Copyright (C) 2014 Simon Norberg
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package net.simno.dmach.model;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * The Channel class represents a channel in dmach.pd
 */
@Parcel
public final class Channel {
    String mName;
    List<Setting> mSettings;
    int mSelectedSetting; // Default selection is 0
    float mPan;

    public Channel() {
        // Required by parceler
    }

    /**
     *
     * @param name  Channel name that must exist in dmach.pd
     * @param pan  Pan position
     */
    public Channel(String name, float pan) {
        mName = name;
        mPan = pan;
        mSettings = new ArrayList<>();
    }

    public void addSetting(Setting s) {
        mSettings.add(s);
    }

    public String getName() {
        return mName;
    }

    public float getPan() {
        return mPan;
    }

    public void setPan(float pan) {
        mPan = pan;
    }

    public int getSelection() {
        return mSelectedSetting;
    }

    public void selectSetting(int selection) {
        mSelectedSetting = selection;
    }

    public Setting getSetting() {
        return mSettings.get(mSelectedSetting);
    }

    public List<Setting> getSettings() {
        return mSettings;
    }

    public int getCount() {
        return mSettings.size();
    }
}
