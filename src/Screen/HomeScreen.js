import * as React from 'react';
import { Button, View, Text } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import { NativeModules } from 'react-native';
const { GamingLoginModule } = NativeModules;


export default function HomeScreen({ navigation }) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Text>Home Screen</Text>
      <Button
        title="Go to Details"
        onPress={() => navigation.navigate('Details')}
      />

      <Button
        title="Login"
        onPress={() => GamingLoginModule.Login(
          (successLogin) => {
            console.log(successLogin);
          },
          (failLogin) => {
            console.log(failLogin);
          }
        )}
      />
      <Button
        title="Get Access token"
        onPress={() => GamingLoginModule.getAccessToken(
          (accessToken) => {
            // get accessToken successfull
            console.log(accessToken);
          },
          (errorMessage) => {
            //error 
            console.log(errorMessage);
          }
        )}
      />
    </View>
  );
}
