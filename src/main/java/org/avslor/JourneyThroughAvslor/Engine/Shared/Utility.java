package org.avslor.JourneyThroughAvslor.Engine.Shared;
import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONObject;

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
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
public class Utility
{
    public static double getAttackDamage(double attackPoints, double frequency)
    {
       return attackPoints * frequency;
    }

    /*
     * This will probably need to be refactored to read a change log or something. Or simply to drive a window of the UI
     * that we will call about.
     */
    public static void getProjectInfo()
    {
    }

    public static JSONObject getJSONOBject()
    {
        //for the time being
        return new JSONObject();
    }

    public static JSONObject readStoryAssets()
    {
        return new JSONObject();
    }

    public static String handleColonInException(String e)
    {
        int whereIsColon =0;
        char[] someText = new char[e.length()];
        someText = e.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int i =0; i<someText.length;i++)
        {
            if(someText[i]==':')
            {
                whereIsColon = i;
                break;
            }
        }
        for(int j=0;j<whereIsColon;j++)
        {
            buffer.append(someText[j]);
        }
        return buffer.toString();
    }

    public static String handleIT(Exception e)
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("There was an error: ");
        buffer.append(handleColonInException(e.toString()));
        buffer.append(" has occurred please do something about this \n");
        return buffer.toString();
    }
}
