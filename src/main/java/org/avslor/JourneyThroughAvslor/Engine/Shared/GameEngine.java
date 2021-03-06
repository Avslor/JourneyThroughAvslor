package org.avslor.JourneyThroughAvslor.Engine.Shared;

import org.avslor.JourneyThroughAvslor.Engine.Shared.Utility.Storyreader;
import org.avslor.JourneyThroughAvslor.Engine.Shared.Utility.Utility;

import java.io.IOException;

/*   Copyright 2013 James Loyd , Joshua Theze
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIYES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
public class GameEngine implements iGameState
{
    private String mapName;
	private String characterName;
	private String sectionName;
	public GameEngine(String mapName, String charachterName , String sectionName)
    {
        this.mapName = mapName;
		this.characterName = charachterName;
		this.sectionName = sectionName;
    }

   	public void Start() throws Exception
    {
        boolean isRunning = true;
        while (isRunning) {
            try {
                int i = 3;
                Storyreader storyreader = Storyreader.createStoryReader();
                System.out.println(storyreader.ReadStory());
                System.out.println(storyreader.ReadStoryAtLine(sectionName, i));
                System.out.println(mapName + " " + characterName + " " + sectionName);
                isRunning = false;
            } catch (Exception e) {
                Utility.handleIT(e);
            }
        }
    }

}
